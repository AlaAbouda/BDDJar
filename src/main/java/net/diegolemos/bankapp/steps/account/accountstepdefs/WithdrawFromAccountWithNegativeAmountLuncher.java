package net.diegolemos.bankapp.steps.account.accountstepdefs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Run action.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = 
        { "src/specs/features/"
            + "withdraw_from_account_with_negative_amount.feature" }, 
				format = { "html:target/cucumber-report/"
				    + "WithdraWfromAccountWithNegativeAmount" })
public class WithdrawFromAccountWithNegativeAmountLuncher {

}

