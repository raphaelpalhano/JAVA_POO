import javax.swing.JOptionPane;

public class Menu{
    public static void main(String[] args){
        Musica minhasMusicas[] = new Musica[1000];
        
        Boolean iniciador;
        iniciador = true;
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
        String nomeUser = JOptionPane.showInputDialog("Nome: ");
        JOptionPane.showMessageDialog(null, "Seja bem vindo, " + nomeUser + "!" + " Este e o menu de musicas!");
        // Iniciando o sistema menu:
        while(iniciador == true){
             
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("Para acessar as funcoes do menu digite o numero de uma   das opcoes abaixo:" + "\n" + "1: Cadastrar Musicas" + "\n" + "2: Localizar e alterar dados da musica" + "\n" + "3: Listar todas as musicas e seus dados" + "\n" + "4: listar as musicas de um determinado ano" + "\n" + "5: Finalizar o programa"));
            switch(escolha){
                case 1:
                    for(int i =0; i <= 1000; i++){
                        minhasMusicas[i] = new Musica();
                        minhasMusicas[i].setMusica(JOptionPane.showInputDialog("Nome da musica: "));
                        minhasMusicas[i].setInterprete(JOptionPane.showInputDialog("Interprete: "));
                        minhasMusicas[i].setCompositor(JOptionPane.showInputDialog("Compositor: "));
                        minhasMusicas[i].setAnoComposicao(JOptionPane.showInputDialog("Ano: "));
                        String escolher = JOptionPane.showInputDialog("Quer registrar outrar musica? ");
                        if(escolher.equalsIgnoreCase("sim")){
                            continue;
                        }else{
                            break;
                        }
                    }
                    break;
                case 2:
                    String buscaMusica;
                    buscaMusica = JOptionPane.showInputDialog("Qual musica voce deseja ouvir? ");
                    for(int i = 0; i < minhasMusicas.length; i++){
                            
                        if(buscaMusica.equalsIgnoreCase(minhasMusicas[i].getMusica())){
                            JOptionPane.showMessageDialog(null, "A musica encontrada foi: " + minhasMusicas[i].getMusica());
                            String questao;
                            questao = JOptionPane.showInputDialog("Voce deseja alterar alguma informacao dessa musica? ");
                            if(questao.equalsIgnoreCase("sim")){
                                minhasMusicas[i].setMusica(JOptionPane.showInputDialog("Nome da musica: "));
                                minhasMusicas[i].setInterprete(JOptionPane.showInputDialog("Interprete: "));
                                minhasMusicas[i].setCompositor(JOptionPane.showInputDialog("Compositor: "));
                                minhasMusicas[i].setAnoComposicao(JOptionPane.showInputDialog("Ano: "));
                                break;

                            }else{
                                JOptionPane.showMessageDialog(null, "Voltando para menu...");
                                break;
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Musica não encontrada, tente novamente com alguma informacao mais especifica." + "\n" + "Ha somente a musica " + minhasMusicas[i].getMusica());
                            break;
                        }

                    }
                    break;
                case 3:
                   
                    try{
                        for(int i=0; i < minhasMusicas.length; i++){
                            JOptionPane.showMessageDialog(null, "Musica " + "(" + i + "): " + minhasMusicas[i].getMusica());   

                        }
                    }
                    catch(NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Voltando para o menu...");
                        break;
                    }
                        
                    
                    break;
                   
                    


                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    iniciador = false;
                    break;
                
                    
                    


                default:
                    JOptionPane.showMessageDialog(null, "Opcao incorreta, tente novamente!");
                    break;
                
                }
                

            } 
        System.exit(0);   
    }
    
}

    

