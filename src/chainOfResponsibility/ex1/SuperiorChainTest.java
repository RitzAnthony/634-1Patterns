package chainOfResponsibility.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: chainOfResponsibility.ex1
 * Date: 4/14/2018
 */
public class SuperiorChainTest {
    public static void main(String[] args) {
        Superior privateSuperior = new PrivateSuperior();
        Superior sergeantSuperior = new SergeantSuperior();
        Superior majorSuperior = new MajorSuperior();

        Superior chainOfSuperiors = privateSuperior;
        privateSuperior.setSuperior(sergeantSuperior);
        sergeantSuperior.setSuperior(majorSuperior);

        MilitaryRequest request1 = new MilitaryRequest(13);
        MilitaryRequest request2 = new MilitaryRequest(26);
        MilitaryRequest request3 = new MilitaryRequest(56);

        chainOfSuperiors.handleRequest(request1);
        chainOfSuperiors.handleRequest(request2);
        chainOfSuperiors.handleRequest(request3);
    }
}
