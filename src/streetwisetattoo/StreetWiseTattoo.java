package streetwisetattoo;
import java.util.Scanner;

public class StreetWiseTattoo {
    
    public static void main(String[] args) {
        String strResposta, strPronto, strEstiloTattoo, strIndicacao = "", strInformacao = "";
        int intEscolhaEstilo, intEscolhaInformacao;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("                        STREET WISE TATTOO                        ");
        System.out.println("          Estudio de tatuagem na Zona Leste de Sao Paulo          ");
        System.out.println("------------------------------------------------------------------");
        System.out.println();        
        System.out.println("                         Seja bem vindo!                          ");
        System.out.println("Te ajudaremos a escolher o tatuador que atende sua necessidade");
        System.out.println();                
        
        System.out.println("Responda as perguntas com 'SIM' ou 'NAO' ");
        System.out.println("Voce e maior de idade?");
        strResposta = input.next();
        
        if ( strResposta.equalsIgnoreCase("NÃO") || strResposta.equalsIgnoreCase("NAO") ){
            System.out.println("Voce tem permissao do seu responsavel?");
            strResposta = input.next();
            
            if ( strResposta.equalsIgnoreCase("NÃO") || strResposta.equalsIgnoreCase("NAO") ) {
                System.out.println("Desculpa, voce nao pode fazer uma tatuagem em nosso estudio!");
                System.exit(0);
            }
        }

        if ( strResposta.equalsIgnoreCase("SIM") || strResposta.equalsIgnoreCase("S") ){
        
            strEstiloTattoo = "";
            strPronto = "";
        
            while ( (strEstiloTattoo.equals("")) && (strPronto.equals("")) || (strEstiloTattoo.equalsIgnoreCase("OPCAO INVALIDA!")) || ( (strEstiloTattoo.equals("")) && (strPronto.equalsIgnoreCase("Sim") || strPronto.equalsIgnoreCase("s")) )  || ( (strEstiloTattoo.equalsIgnoreCase("informacao")) && (strPronto.equalsIgnoreCase("s") || strPronto.equalsIgnoreCase("sim")) ) ) {
            
                System.out.println();
            
                if ( (strPronto.equalsIgnoreCase("")  &&  strEstiloTattoo.equalsIgnoreCase("")) || (strEstiloTattoo.equalsIgnoreCase("OPCAO INVALIDA!"))  ){
                    System.out.println("Escolha o numero do estilo de tatuagem que voce gostaria de fazer");
                    if (strPronto.equalsIgnoreCase("")  &&  strEstiloTattoo.equalsIgnoreCase("")) {
                        System.out.println("     ou digite 12 se quiser saber mais sobre algum dos estilo      ");
                    }
                    System.out.println(); 
                    System.out.println(" [1] - Blackwork");
                    System.out.println(" [2] - Dark");
                    System.out.println(" [3] - Fine Line");
                    System.out.println(" [4] - Geek");
                    System.out.println(" [5] - Lettering");
                    System.out.println(" [6] - Neotradicional");
                    System.out.println(" [7] - Ornamental");
                    System.out.println(" [8] - Realismo");
                    System.out.println(" [9] - Tradicional");
                    System.out.println(" [10] - Tradicional Americano");
                    System.out.println(" [11] - Tradicional Moderna");
                    if (strPronto.equalsIgnoreCase("")  &&  strEstiloTattoo.equalsIgnoreCase("")) {
                        System.out.println(" [12] - Me diga mais sobre um dos estilos");
                    }
                    System.out.println();                
                }
                if ( strPronto.equalsIgnoreCase("Sim") || strPronto.equalsIgnoreCase("S") ) {
                    System.out.println("Digite o numero do estilo de tatuagem que voce gostaria de fazer:");
                }    
            
                intEscolhaEstilo = input.nextInt();
            
                if ( strPronto.equalsIgnoreCase("") || strPronto.equalsIgnoreCase("nao") || strPronto.equalsIgnoreCase("não") || strPronto.equalsIgnoreCase("n") ){
                    switch (intEscolhaEstilo){
                        case 1: strEstiloTattoo = "Blackwork"; strIndicacao = "a Nicole Tredicci, o Quetz e o Rik."; break;
                        case 2: strEstiloTattoo = "Dark";  strIndicacao = "o Quetz."; break;
                        case 3: strEstiloTattoo = "Fine Line"; strIndicacao = "a Nicole Tredicci."; break; 
                        case 4: strEstiloTattoo = "Geek"; strIndicacao = "o Rik."; break;
                        case 5: strEstiloTattoo = "Lettering"; strIndicacao = "a Rafa Martins."; break;
                        case 6: strEstiloTattoo = "Neotradicional"; strIndicacao = "o Bruno Martins e o Giovanni Gualtieroni."; break; 
                        case 7: strEstiloTattoo = "Ornamental"; strIndicacao = "a Rafa Martins."; break;
                        case 8: strEstiloTattoo = "Realismo"; strIndicacao = "o Bruno Martins."; break;
                        case 9: strEstiloTattoo = "Tradicional"; strIndicacao = "o Quetz."; break;
                        case 10: strEstiloTattoo = "Tradicional Americano"; strIndicacao = "o Diego Jandoza e a Jenifer Campos."; break;
                        case 11: strEstiloTattoo = "Tradicional Moderna"; strIndicacao = "o Diego Jandoza, o Giovanni Gualtieroni, a Jenifer Campos, a Nicole Tredicci e o Rik."; break;
                        case 12: strEstiloTattoo = "informacao"; break;
                        default: strEstiloTattoo = "OPCAO INVALIDA!"; break;
                    }
                    if (strEstiloTattoo.equals("OPCAO INVALIDA!")) {
                
                        System.out.println();
                        System.out.println(strEstiloTattoo);
                        System.out.println();
                        System.out.println("------------------------------------------------------------------");
                        System.out.println();
                    } 
                }
            
                if ( strPronto.equalsIgnoreCase("Sim") || strPronto.equalsIgnoreCase("s") ){
               
                    switch (intEscolhaEstilo){
                        case 1: strEstiloTattoo = "Blackwork"; strIndicacao = "a Nicole Tredicci, o Quetz e o Rik."; break;
                        case 2: strEstiloTattoo = "Dark";  strIndicacao = "o Quetz."; break;
                        case 3: strEstiloTattoo = "Fine Line"; strIndicacao = "a Nicole Tredicci."; break; 
                        case 4: strEstiloTattoo = "Geek"; strIndicacao = "o Rik."; break;
                        case 5: strEstiloTattoo = "Lettering"; strIndicacao = "a Rafa Martins."; break;
                        case 6: strEstiloTattoo = "Neotradicional"; strIndicacao = "o Bruno Martins e Giovanni Gualtieroni."; break; 
                        case 7: strEstiloTattoo = "Ornamental"; strIndicacao = "a Rafa Martins."; break;
                        case 8: strEstiloTattoo = "Realismo"; strIndicacao = "o Bruno Martins."; break;
                        case 9: strEstiloTattoo = "Tradicional"; strIndicacao = "o Quetz."; break;
                        case 10: strEstiloTattoo = "Tradicional Americano"; strIndicacao = "o Diego Jandoza e a Jenifer Campos."; break;
                        case 11: strEstiloTattoo = "Tradicional Moderna"; strIndicacao = "o Diego Jandoza, o Giovanni Gualtieroni, a Jenifer Campos, a Nicole Tredicci e o Rik."; break;
                        default: strEstiloTattoo = "OPCAO INVALIDA!"; break;
                    }
            
                    if (strEstiloTattoo.equals("OPCAO INVALIDA!")) {
                        System.out.println();
                        System.out.println(strEstiloTattoo);
                        System.out.println();
                        System.out.println("------------------------------------------------------------------");
                        System.out.println();
                    }
                } 
                
                if (strEstiloTattoo.equalsIgnoreCase("informacao")) {
                    strPronto = "nao";
                
                    while (strPronto.equalsIgnoreCase("n") || strPronto.equalsIgnoreCase("nao") || strPronto.equalsIgnoreCase("não")) {
                        System.out.println("Digite o numero do estilo que voce quer informacao");
                        intEscolhaInformacao = input.nextInt();
                
                        switch (intEscolhaInformacao){
                            case 1: strInformacao = "O Blackswork e um estilo de tatuagem que se caracteriza por usar apenas tinta preta ou tonalidades escuras para criar formas geometricas ou desenhos abstratos ou figurativos de alto contraste na pele. Utiliza de linhas grossas e solidas para criar designs intrincados, focando na forca das formas em preto, resultando em tatuagens de aspecto unico e visualmente impactante." ; break;
                            case 2: strInformacao = "Dark tattoo sao tatuagens que utilizam de cores escuras e temas sombrios, como o horror, o gotico ou designs que destacam temas como o medo." ; break;
                            case 3: strInformacao = "Fine Line e um estilo de tatuagem que se destaca pela utilizacao de linhas finas e delicadas para criar desenhos detalhados e sutis. Geralmente, esse estilo envolve um trabalho de linha preciso e muitas vezes apresenta designs minimalistas, retratos e ilustracoes intricadas, resultando em tatuagens elegantes e discretas" ; break;
                            case 4: strInformacao = "Geek tattoo se refere a tatuagens que incorporam elementos da cultura geek, como personagens de filmes, quadrinhos, videogames, sismbolos de series de TV, e outras referencias da cultura pop nerd. Essas tatuagens sao uma otima forma de expressao pessoal para quem e entusiasta desses universos." ; break;
                            case 5: strInformacao = "Lettering e um estilo de tatuagem que se concentra na criacao de letras e palavras como o elemento central do design. Geralmente, envolve a escolha de uma fonte ou estilo de escrita especifico para transmitir uma mensagem, nome ou citacao. Esse estilo e popular para tatuagens de frases pessoais, datas significativas ou palavras inspiradoras." ; break;
                            case 6: strInformacao = "Neotradicional e um estilo de tatuagem que combina elementos da tatuagem tradicional com uma abordagem moderna. Ele inclui linhas ousadas, cores vibrantes e detalhes refinados, criando tatuagens com uma estetica classica, mas com um toque contemporaneo. Geralmente, envolve imagens como flores, animais e retratos com uma aparencia ousada e nitida." ; break;
                            case 7: strInformacao = "O estilo de tatuagem Ornamental e um estilo que se concentra em padroes decorativos, detalhes intricados e designs geometricos, muitas vezes sem representacoes figurativas. O objetivo e criar tatuagens altamente ornamentadas e esteticamente complexas, com enfase na estetica visual em vez de imagens especificas." ; break;
                            case 8: strInformacao = "O realismo e um estilo de tatuagem que se esforca para criar imagens que parecem extremamente semelhantes a realidade. Isso envolve a reproducao de detalhes precisos, sombreamento suave e uma tecnica que visa capturar a aparencia exata de objetos, paisagens, retratos ou qualquer coisa que o tatuador esteja representando. O objetivo e que a tatuagem pareça uma fotografia ou uma pintura hiper-realista na pele." ; break;
                            case 9: strInformacao = "A Tatuagem Tradicional, tambem conhecida como 'Old School', e um estilo de tatuagem caracterizado por linhas ousadas, cores vivas e temas classicos. Ela inclui contornos nitidos, cores limitadas a uma paleta basica ou preta. A Tatuagem Tradicional e conhecida por sua simplicidade e estetica atemporal." ; break;
                            case 10: strInformacao = "Tradicional Americano tattoo, também conhecida como 'American Traditional', e um estilo classico de tatuagem originado nos EUA no inicio do seculo XX e raizes nas tatuagens marinhas. Caracteriza-se por linhas ousadas, cores vividas e temas iconicos, como ancoras, caveiras e pin-ups." ; break;
                            case 11: strInformacao = "A tatuagem Tradicional Moderna e uma interpretacao contemporanea do estilo de tatuagem tradicional. Ela mantem a estetica classica, com contornos nitidos, cores ousadas e incorpora elementos modernos, como detalhes mais elaborados e tecnicas atualizadas. Isso resulta em tatuagens que preservam a tradicao, mas com um toque fresco e atual." ; break;   
                            default: strInformacao = "OPCAO INVALIDA!" ; break;
                        }
                        System.out.println();
                        System.out.println(strInformacao);  
                        System.out.println();
                        System.out.println("Agora voce esta pronto para escolher o estilo que gostaria de tatuar?[S/N]");
                        strPronto = input.next();
                        strEstiloTattoo = "informacao";
                    } 
                }                                                     
            }
            System.out.println();
            System.out.println("Voce tem interesse no estilo " + strEstiloTattoo);
            System.out.println();
            System.out.println("Para o estilo " + strEstiloTattoo + ", te indicamos " + strIndicacao);   
            System.out.println();
            System.out.println("Volte sempre!");
        }
    }    
}
