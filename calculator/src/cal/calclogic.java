/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

/**
 *
 * @author ACER
 */
public class calclogic {
    
    //-- Instance variables.
    private int _currentTotal;   // The current total is all we need to remember.
    
    /** Constructor */
    public calclogic() {
        _currentTotal = 0;
    }
    
    public String getTotalString() {
        return "" + _currentTotal;
    }
    
    public void setTotal(String n) {
        _currentTotal = convertToNumber(n);
    }
    
    public void add(String n) {
        _currentTotal += convertToNumber(n);
    }
    
    public void subtract(String n) {
        _currentTotal -= convertToNumber(n);
    }
    
    public void multiply(String n) {
        _currentTotal *= convertToNumber(n);
    }
    
    public void divide(String n) {
        _currentTotal /= convertToNumber(n);
    }
    
    private int convertToNumber(String n) {
        return Integer.parseInt(n);
    }
}
