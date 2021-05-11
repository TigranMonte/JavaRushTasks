package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CashMachine;
import com.javarush.task.task26.task2613.ConsoleHelper;
import com.javarush.task.task26.task2613.CurrencyManipulator;
import com.javarush.task.task26.task2613.CurrencyManipulatorFactory;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.ResourceBundle;
import static com.javarush.task.task26.task2613.CashMachine.RESOURCE_PATH;


class InfoCommand implements Command {
    private ResourceBundle validCreditCards = ResourceBundle.getBundle(RESOURCE_PATH + "verifiedCards");
    private ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH + "login_en");
    @Override
    public void execute()throws InterruptOperationException
    {
        ConsoleHelper.writeMessage(res.getString("before"));
        boolean money = false;
        for (CurrencyManipulator cur : CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
            if (cur.hasMoney()) {
                if (cur.getTotalAmount() > 0) {
                    ConsoleHelper.writeMessage(cur.getCurrencyCode() + " - " + cur.getTotalAmount());
                    money = true;
                }
            }
        }
        if (!money) {
            ConsoleHelper.writeMessage(res.getString("no.money"));
        }
    }
}
