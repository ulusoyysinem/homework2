package inheretenceDemo;

public class Main {

	public static void main(String[] args) {
		// Class cannot extend multiple classes!!!
		
		//TeachersLoanManager teacherLoanManager = new TeachersLoanManager();
		//teacherLoanManager.Calculate();
		
		LoanUI loanUI = new LoanUI();
		loanUI.CalculateLoan(new TeachersLoanManager());
		loanUI.CalculateLoan(new FarmLoanManager());
		loanUI.CalculateLoan(new PersonalMilitaryLoanManager());
	}

}