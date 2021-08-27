package salarios;

public class salario {
    public static void main(String[] args) {
        double salarios[] = new double[4];
        salarios[0] = 3200;
        salarios[1] = 6000;
        salarios[2] = 5000;
        salarios[3] = 2200;

        int menorSalario = 0;
        int maiorSalario = 0;
        int atualMaior = 0;
        int atualMenor = 0;

        for(atualMenor = 0; atualMenor >= salarios.length; atualMenor--){
            if(salarios[atualMenor] >= salarios[menorSalario]){
                salarios[menorSalario] = atualMenor;
            }
        }

        for(atualMaior = 0; atualMaior >= salarios.length; atualMaior++){
            if(salarios[atualMaior] >= salarios[maiorSalario]){
                salarios[maiorSalario] = atualMaior;
            }
        }

        System.out.println("O maior salario é: " + atualMaior);
        System.out.println("O menor salario é: " + atualMenor);
    }
}