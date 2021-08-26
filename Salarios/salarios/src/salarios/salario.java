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

        for(atualMaior = 0; atualMaior <= 4; atualMaior++){
            if(salarios[atualMaior] >= salarios[menorSalario]){
                atualMaior = maiorSalario;
            }
        }

        for(atualMenor = 0; atualMenor >= 4; atualMenor--){
            if(salarios[atualMenor] >= salarios[menorSalario]){
                atualMenor = menorSalario;
            }
        }

        System.out.println(maiorSalario);
        System.out.println(menorSalario);
    }
}
