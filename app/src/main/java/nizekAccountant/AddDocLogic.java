/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nizekAccountant;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class AddDocLogic {

    public AddDocLogic() {
    }

    public String[] passDocToDatabase(String payee, String cost, String discripton) {
        //gets this from logic
        return null;
    }

    void groupedSubmit(JButton btn) {

        if (btn.isSelected()) {

            //add data to data base -> write to file
        } else {
            JPanel addingDocPanel = new JPanel();
            groupedSubmit(btn);

        }

    }

    public boolean canSubmitDoc(String payeeName, String cost, String discription) { //name and password are getting from input field.folan.getText()
        boolean areFieldsCorrect = false;

//==========regex check================
        //  boolean emailHasValidate = (Validator.emailIsValid(emailfield));
        boolean nameValid = Validator.nameIsValid(payeeName);
        boolean numberValid = Validator.costIsValid(cost);
        return (numberValid && nameValid);

    }

}


