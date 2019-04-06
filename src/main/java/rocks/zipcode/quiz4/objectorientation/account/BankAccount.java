package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Double val = 0.0;

    public void setBalance(Double val) {
        this.val = val;

    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        if (amountToIncreaseBy < 0.0) {
            throw new IllegalArgumentException();
        } else {
            val += amountToIncreaseBy;
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        if (amountToDecreaseBy > val) {
            throw new IllegalArgumentException();
        } else if (amountToDecreaseBy < 0.0) {
            throw new IllegalArgumentException();
        } else {
            val -= amountToDecreaseBy;

        }
    }

    @Override
    public Double getBalance() {
        return val;
    }
}
