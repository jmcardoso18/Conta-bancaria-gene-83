package conta_bancaria;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import conta_bancaria.util.Cores;

public class teste {
//
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Texto Colorido");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);

            // 1. Defina a cor em uma variável
            Color minhaCor = Color.GREEN; // Cor verde

            // 2. Crie um JLabel e aplique a cor a ele
            JLabel rotulo = new JLabel("Este é um texto verde");
            rotulo.setForeground(minhaCor); // Aplica a cor verde ao texto

            frame.add(rotulo);
            frame.setVisible(true);
            
            /*saidaEmCores(Cores.TEXT_CYAN_BOLD, Arrays.asList("Linha 1","Linha 2","Linha 3","Linha 4"));
             * public static void saidaEmCores(String cor, List<String> texto) {
		System.out.print(cor + Cores.ANSI_BLACK_BACKGROUND);
		texto.forEach(System.out::println);
		System.out.println(Cores.TEXT_RESET + Cores.ANSI_BLACK_BACKGROUND);
	}
	
             */
        });
    }
}


