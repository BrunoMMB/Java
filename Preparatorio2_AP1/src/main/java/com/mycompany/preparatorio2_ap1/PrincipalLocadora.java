package com.mycompany.preparatorio2_ap1;
/**
 *
 * @author fabriciomendonca
 */
public class PrincipalLocadora {

    public static void main(String[] args) {
        Locacao L1 = new Locacao("GUV-0467", 1, 150);
        L1.setDataLocacao("27-04-2019");
        float totalL1 = L1.calcularValorTotal(10);
        
        Locacao L2 = new Locacao("PXZ-1045", 2, 220);
        L2.setDataLocacao("27-04-2019");
        float totalL2 = L2.calcularValorTotal(10);
        
        Locacao L3 = new Locacao("PTO-5619", 3, 180);
        L3.setDataLocacao("27-04-2019");
        float totalL3 = L3.calcularValorTotal(10);
        
        if (totalL1 > totalL2 && totalL1 > totalL3) {
            L1.efetuarDevolucao("13-05-2019");
            L1.exibir();
            System.out.println("Valor da locação: R$ " + totalL1);
        }
        else if (totalL2 > totalL1 && totalL2 > totalL3) {
            L2.efetuarDevolucao("13-05-2019");
            L2.exibir();
            System.out.println("Valor da locação: R$ " + totalL2);
        }
        else if (totalL3 > totalL1 && totalL3 > totalL2) {
            L3.efetuarDevolucao("13-05-2019");
            L3.exibir();
            System.out.println("Valor da locação: R$ " + totalL3);
        }
        else {
            System.out.println("Valores totais da locação são iguais!");
        }
    }
    
}
