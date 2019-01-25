import java.util.Random;
import java.util.Scanner;

public class Madgab
    {
        public static void main(String[] args)
            {
                char[] input;
                String sentence = "";

                printInstructions();
                input = getInput();

                for(int i = 0; i < input.length; i++)
                    {
                        if(input[i] == 'a')
                            {
                                sentence += getAdjective() + " ";
                                    }
                                            else if(input[i] == 'b')
                                            {
                                                sentence += getAdverb() + " ";
                                                }
                                                        else if(input[i] == 'v')
                                                        {  
                                                                sentence += getVerb() + " ";
                                                                }
                                                                        else if(input[i] == 'n')
                                                                        {
                                                                                sentence += getNoun() + " ";
                                                                                }
                                                                                    else if(input[i] == 't')
                                                                                    {
                                                                                        sentence += getArticle() + " ";
                                                                                        }
                                                                                            }

                                                                                                System.out.println("Your sentence is:");
                                                                                                System.out.println(sentence);
                                                                                                }

                                                                                                    static void printInstructions()
                                                                                                    {
                                                                                                        System.out.println("-----------------------------------------------------------");
                                                                                                        System.out.println("|                          MADGAB                         |");
                                                                                                        System.out.println("-----------------------------------------------------------");
                                                                                                        System.out.println("| Makes sentences based on the type of words you give it. |");
                                                                                                        System.out.println("| a - Adjective                                           |");
                                                                                                        System.out.println("| b - Adverb                                              |");
                                                                                                        System.out.println("| v - Verb                                                |");
                                                                                                        System.out.println("| n - Noun                                                |");
                                                                                                        System.out.println("| t - Article                                             |");
                                                                                                        System.out.println("| Example: tanvtnb                                        |");
                                                                                                        System.out.println("| Output: an important eye found the idea better          |");
                                                                                                        System.out.println("-----------------------------------------------------------");
                                                                                                        System.out.println("\n");
                                                                                                    }
                                                                                                }

                                                                                                static char[] getInput()
                                                                                            {
                                                                                            Scanner keyboard = new Scanner(System.in);
                                                                                            System.out.println("Enter the types of words you want in the sentence (a/b/v/n/t)");
                                                                                            return keyboard.next().toCharArray();
                                                                                        }

                                                                                        static String getAdjective()
                                                                                    {
                                                                                    String[] adjectives = {"other","new","good","high","old","great","big","American","small","large","national","young","different","black","long","little","important","political","bad","white","real","best","right","social","only","public","sure","low","early","able","human","local","late","hard","major","better","economic","strong","possible","whole","free","military","true","federal","international","full","special","easy","clear","recent","certain","personal","open","red","difficult","available","likely","short","single","medical","current","wrong","private","past","foreign","fine","common","poor","natural","significant","similar","hot","dead","central","happy","serious","ready","simple","left","physical","general","environmental","financial","blue","democratic","dark","various","entire","close","legal","religious","cold","final","main","green","nice","huge","popular","traditional","cultural"};
                                                                                    Random rand = new Random();
                                                                                    return adjectives[rand.nextInt(adjectives.length)];
                                                                                }

                                                                                static String getAdverb()
                                                                        {
                                                                        String[] adverbs = {"up","so","out","just","now","how","then","more","also","here","well","only","very","even","back","there","down","still","in","as","to","when","never","really","most","on","why","about","over","again","where","right","off","always","today","all","far","long","away","yet","often","ever","however","almost","later","much","once","least","ago","together","around","already","enough","both","maybe","actually","probably","home","of course","perhaps","little","else","sometimes","finally","less","better","early","especially","either","quite","simply","nearly","soon","certainly","quickly","no","recently","before","usually","thus","exactly","hard","particularly","pretty","forward","ok","clearly","indeed","rather","that","tonight","close","suddenly","best","instead","ahead","fast","alone","eventually","directly"};
                                                                        Random rand = new Random();
                                                                        return adverbs[rand.nextInt(adverbs.length)];
                                                        }

                                                        static String getVerb()
                                                {
                                                String[] verbs = {"were","had","did","said","went","got","made","knew","thought","took","saw","came","wanted","used","found","gave","told","worked","called","tried","asked","needed","felt","became","left","put","meant","kept","let","began","seemed","helped","showed","heard","played","ran","moved","lived","believed","brought","happened","wrote","sat","stood","lost","paid","met","included","continued","set","learnt","changed","led","understood","watched","followed","stopped","created","spoke","read","spent","grew","opened","walked","won","taught","offered","remembered","considered","appeared","bought","served","died","sent","built","stayed","fell","cut","reached","killed","raised","passed","sold","decided","returned","explained","hoped","developed","carried","broke","received","agreed","supported","hit","produced","ate","covered","caught","drew","chose"};
                                                Random rand = new Random();
                                                return verbs[rand.nextInt(verbs.length)];
                                            }

                                            static String getNoun()
                                    {
                                    String[] nouns = {"time","year","people","way","day","man","thing","woman","life","child","world","school","state","family","student","group","country","problem","hand","part","place","case","week","company","system","program","question","work","government","number","night","point","home","water","room","mother","area","money","story","fact","month","lot","right","study","book","eye","job","word","business","issue","side","kind","head","house","service","friend","father","power","hour","game","line","end","member","law","car","city","community","name","president","team","minute","idea","kid","body","information","back","parent","face","others","level","office","door","health","person","art","war","history","party","result","change","morning","reason","research","girl","guy","moment","air","teacher","force","education"};
                                    Random rand = new Random();
                                    return nouns[rand.nextInt(nouns.length)];
                }

                 static String getArticle()
            {
                 String[] articles = { "a", "an", "the" };
                 Random rand = new Random();
                return articles[rand.nextInt(articles.length)];
        }
    }