package Controller;

public class CalcularImc_DAO {
    
    public static void imc() {
        /* Pegando as variáveis */
        double altura = Double.parseDouble(View.Inicio_GUI.altura.getText());
        double peso = Double.parseDouble(View.Inicio_GUI.peso.getText());
        double calc = peso / (altura * altura);
    
        /* Imagens invisíveis */
        View.Inicio_GUI.abaixo_peso.setVisible(false);
        View.Inicio_GUI.normal.setVisible(false);
        View.Inicio_GUI.sobrepeso.setVisible(false);
        View.Inicio_GUI.obesidade_leve.setVisible(false);
        View.Inicio_GUI.obesidade_moderada.setVisible(false);
        View.Inicio_GUI.obesidade_morbida.setVisible(false);
        
        /* Imagem visível */
        if (calc < 18.5) {
            /* Abaixo do peso*/
            View.Inicio_GUI.abaixo_peso.setVisible(true);
        } else if (calc > 18.5 && calc < 24.9) {
            /* Peso normal */
            View.Inicio_GUI.normal.setVisible(true);
        } else if (calc > 24.9 && calc < 29.9) {
            /* Sobrepeso */
            View.Inicio_GUI.sobrepeso.setVisible(true);
        } else if (calc > 29.9 && calc < 34.9) {
            /* Obesidade leve */
            View.Inicio_GUI.obesidade_leve.setVisible(true);
        } else if (calc > 34.9 && calc < 39.9) {
            /* Obesidade moderada */
            View.Inicio_GUI.obesidade_moderada.setVisible(true);
        } else {
            /* Obesidade mórbida */
            View.Inicio_GUI.obesidade_morbida.setVisible(true);
        }
        
        View.Inicio_GUI.valorImc.setText("O seu IMC é " + String.format("%.2f", calc));
    }
    
    public static void LimparTudo() {
        View.Inicio_GUI.abaixo_peso.setVisible(false);
        View.Inicio_GUI.normal.setVisible(false);
        View.Inicio_GUI.sobrepeso.setVisible(false);
        View.Inicio_GUI.obesidade_leve.setVisible(false);
        View.Inicio_GUI.obesidade_moderada.setVisible(false);
        View.Inicio_GUI.obesidade_morbida.setVisible(false);
        View.Inicio_GUI.altura.setText("");
        View.Inicio_GUI.peso.setText("");
        View.Inicio_GUI.valorImc.setText("");
    }
}