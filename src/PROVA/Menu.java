import javax.swing.JOptionPane;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Menu{

     //VALIDADOR DE NÚMEROS INTEIROS
    public static Boolean eNumero(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch(NumberFormatException e){
            return false;
        }

    }

    //MAIN
    public static void main(String[] args){
        Musica minhasMusicas[] = new Musica[1000];
        
        //INICIDOR DO PROGRAMA
        Boolean iniciador;
        iniciador = true;
        
        // CONTADOR DE LOOP. UTILIZADO APLICAR O CONCEITO DE QUEE
        int tamanho = 0;

        // DEFININDO O menu
        /*
        Menu 5 opções:
        1-	Cadastrar Músicas
        2-	Localizar uma música pelo seu nome e permitir alterar os seus dados
        3-	Listar todas as músicas e seus dados
        4-	Listar as músicas de um determinado ano
        5-	Finalizar o programa
        
        1 Gerar um loop com while inifito com condição booleana
        2 Construir uma estrutura condicional
        */

        // Variável guardando o valor String que será o nome
        String nomeUser = JOptionPane.showInputDialog("Seu Nome: ");
        JOptionPane.showMessageDialog(null, "Seja bem vindo, " + nomeUser + "!" + " Este e o menu de musicas!");
       
        // Iniciando o sistema menu:
        while(iniciador == true){
             
            String escolha = JOptionPane.showInputDialog("Para acessar as funcoes do menu digite o numero de uma   das opcoes abaixo:" + "\n" + "1: Cadastrar Musicas" + "\n" + "2: Localizar e alterar dados da musica" + "\n" + "3: Listar todas as musicas e seus dados" + "\n" + "4: listar as musicas de um determinado ano" + "\n" + "5: Finalizar o programa");
            if(eNumero(escolha)){
                switch(escolha){
                    case "1":
                        for(int i =0; i <= minhasMusicas.length; i++){
                            if(tamanho >= 1){
                                minhasMusicas[tamanho] = new Musica();
                                minhasMusicas[tamanho].setMusica(JOptionPane.showInputDialog("Nome da musica n. " + (tamanho)));
                                minhasMusicas[tamanho].setInterprete(JOptionPane.showInputDialog("Interprete: n." + (tamanho)));
                                minhasMusicas[tamanho].setCompositor(JOptionPane.showInputDialog("compositor n. " + ( tamanho)));
                                minhasMusicas[tamanho].setAnoComposicao(JOptionPane.showInputDialog("Ano n. " + (tamanho )));
                                
                            }else{
                                minhasMusicas[i] = new Musica();
                                minhasMusicas[i].setMusica(JOptionPane.showInputDialog("Nome da musica: "));
                                minhasMusicas[i].setInterprete(JOptionPane.showInputDialog("Interprete: "));
                                minhasMusicas[i].setCompositor(JOptionPane.showInputDialog("compositor: "));
                                minhasMusicas[i].setAnoComposicao(JOptionPane.showInputDialog("Ano: "));
                                
                            }
                            
                           
                            String escolher = JOptionPane.showInputDialog("Quer registrar outrar musica? [sim/nao]: ");
                            tamanho++;
                            if(escolher.equalsIgnoreCase("sim")){
                                continue;
                            }else{
                                JOptionPane.showMessageDialog(null, "Voltando para o menu principal.");
                                break;
                            }
                            
                        }
                        break;
                    case "2":
                        String buscaMusica;
                        buscaMusica = JOptionPane.showInputDialog("Qual musica voce deseja ouvir? ");
                        for(int i = 0; i < minhasMusicas.length; i++){
                            try{    
                                if(buscaMusica.equalsIgnoreCase(minhasMusicas[i].getMusica())){
                                    JOptionPane.showMessageDialog(null, "A musica encontrada foi: " + minhasMusicas[i].getMusica());
                                    String questao;
                                    questao = JOptionPane.showInputDialog("Voce deseja alterar alguma informacao dessa musica? ");
                                    if(questao.equalsIgnoreCase("sim")){
                                        
                                        minhasMusicas[i].setMusica(JOptionPane.showInputDialog("Nome da musica: "));
                                        minhasMusicas[i].setInterprete(JOptionPane.showInputDialog("Interprete: "));
                                        minhasMusicas[i].setCompositor(JOptionPane.showInputDialog("compositor: "));
                                        minhasMusicas[i].setAnoComposicao(JOptionPane.showInputDialog("Ano: "));

                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Voltando para menu...");
                                        break;
                                    }
                                }  
                               
    
                        }
                        catch(NullPointerException e){
                            JOptionPane.showMessageDialog(null, "Nao foi encontrado nenhuma musica com esse nome.");
                            JOptionPane.showMessageDialog(null, "Voltando para o menu principal.");
                                break;
                                }
                                    
                       
                        }
                        break;

                    case "3":
                    
                        try{
                            for(int i=0; i < minhasMusicas.length; i++){
                                JOptionPane.showMessageDialog(null, "Musica n. " + i + " " + "\n" +  "Nome: " + minhasMusicas[i].getMusica() + "\n" + " Ano: " + minhasMusicas[i].getAnoComposicao() + "\n" + " Interprete: " + minhasMusicas[i].getInterprete() + "\n" + "Compositor: " + minhasMusicas[i].getCompositor());

                            }
                        }
                        catch(NullPointerException e){
                            JOptionPane.showMessageDialog(null, "Voltando para o menu...");
                            break;
                        }
                            
                        
                        break;

                    case "4":
                        //MUSICA POR Ano
                        JOptionPane.showMessageDialog(null, nomeUser + " esse e o sistema de musica por ano!" + "\n" + "Digite o ano da sua musica no campo a seguir.");
                        String escolhaUsuario = JOptionPane.showInputDialog("Digite o Ano da Musica: ");
                        try{
                            if(eNumero(escolhaUsuario)){
                                for(int i =0; i < minhasMusicas.length; i++){
                                    if(escolhaUsuario.equals(minhasMusicas[i].getAnoComposicao())){
                                        JOptionPane.showMessageDialog(null, "Musica n. " + i + " " + "\n" +  "Nome: " + minhasMusicas[i].getMusica() + "\n" + " Ano: " + minhasMusicas[i].getAnoComposicao() + "\n" + " Interprete: " + minhasMusicas[i].getInterprete() + "\n" + "Compositor: " + minhasMusicas[i].getCompositor());
                                        
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Informacao invalida! Digite um ano com numeros inteiros: (2010).");
                                break;
                            }
                        }
                        catch(NullPointerException e){
                            JOptionPane.showMessageDialog(null, "Nao foram encontradas mais musicas...");
                            JOptionPane.showMessageDialog(null, "Voltando para o menu...");
                            break;

                        }
                        break;

    
                    case "5":
                        JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                        iniciador = false;
                        break;
                    

                    default:
                        JOptionPane.showMessageDialog(null, "Opcao incorreta, tente novamente!");
                        break;
                            

                }
            }else{
                JOptionPane.showMessageDialog(null, "ERRO. Escolha uma das opcoes 1 ao 5!");
            }
        }
        

    System.exit(0);   
    }
       
    
}

