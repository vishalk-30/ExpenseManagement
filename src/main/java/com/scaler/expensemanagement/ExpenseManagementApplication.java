package com.scaler.expensemanagement;

import com.scaler.expensemanagement.commands.CommandExecutor;
import com.scaler.expensemanagement.commands.CreateUserCommand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Scanner;

@SpringBootApplication
@EnableJpaAuditing
public class ExpenseManagementApplication implements CommandLineRunner {
    private CommandExecutor commandExecutor;
    private Scanner scanner;

    public ExpenseManagementApplication(CommandExecutor commandExecutor, CreateUserCommand createUserCommand){
        this.scanner = new Scanner(System.in);
        this.commandExecutor = commandExecutor;
        this.commandExecutor.addCommand(createUserCommand);


    }

    public static void main(String[] args) {
        SpringApplication.run(ExpenseManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        while(true){
            System.out.println("Enter Input: ");
            String input = scanner.nextLine();
            commandExecutor.execute(input);
        }

    }
}
