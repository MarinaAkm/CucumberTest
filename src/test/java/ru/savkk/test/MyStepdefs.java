package ru.savkk.test;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

public class MyStepdefs {
    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void наСчетеПользователяИмеетсяРублей(int arg0) {
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void пользовательСнимаетСоСчетаРублей(int arg0) {
    }

    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void появляетсяПредупреждение(String arg0)  {
        // Write code here that turns the phrase above into concrete actions


        // throws Throwable

        // throw new PendingException();
    }
}
