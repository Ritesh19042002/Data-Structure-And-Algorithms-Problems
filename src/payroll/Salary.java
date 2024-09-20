package payroll;

public class Salary {
    double hra, da, bonus, tax, total, net;
    public double calcNet(double basic){
        hra = basic*0.5;
        da = basic*0.4;
        bonus = basic*0.3;
        total = hra+basic+bonus+da;
        tax = total*0.1;
        net = total - tax;
        return net;
    }
}
