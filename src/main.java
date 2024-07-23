import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");

        System.out.println("Al fin despierto, hace cuanto dormi??... no importa.");
        System.out.println("Por cierto, quien eres tú??, dime tu nombre.");
        System.out.println("");
        Scanner name = new Scanner(System .in);
        String nombre= name.nextLine();
        String saludo= ", un gusto conocerte.";
        System.out.println("");
        System.out.println("asi que " +nombre+saludo);

       System.out.println(" ");

       System.out.println("dime cual es tu edad");
       System.out.println("");
        Scanner edad= new Scanner(System .in);
        int old;
        old= edad.nextInt();
        System.out.println("");
        System.out.println("asi que "+old+", esta bien.  y dime, cuanto mides??");
       
        System.out.println(" ");


        Scanner alto= new Scanner(System .in);
        double altura;
        altura=alto.nextDouble();
        System.out.println("");
        System.out.println(altura+" esta muy bien");

        System.out.println(" ");

        System.out.println("me permites contarte una historia, responde true o false.");
        System.out.println("");
        Scanner historia=new Scanner(System .in);
        boolean cuento;
        cuento =historia.nextBoolean();
        System.out.println("");
        if (cuento){
            System.out.println("muy bien,   En un reino lejano, donde los bosques eran tan antiguos como el tiempo y los ríos cantaban melodías olvidadas, vivía un mago llamado Alaric. Alaric era conocido por su sabiduría y poder, pero también por su corazón solitario. Pasaba sus días estudiando antiguos grimorios y sus noches observando las estrellas, buscando respuestas a preguntas que nadie más se atrevía a formular.\r\n" + //
                                "\r\n" + //
                                "Un día, mientras exploraba un claro escondido en el bosque, Alaric encontró un círculo de flores que brillaban con una luz mágica. En el centro del círculo, danzaba un hada llamada Lyria. Sus alas eran como el cristal y su risa, una melodía que hacía eco en el corazón del mago.\r\n" + //
                                "\r\n" + //
                                "Alaric, fascinado por la belleza y la gracia de Lyria, se acercó con cautela. Lyria, al verlo, dejó de danzar y lo miró con curiosidad. “¿Quién eres, extraño?”, preguntó con una voz que sonaba como campanillas.\r\n" + //
                                "\r\n" + //
                                "“Soy Alaric, un mago de estas tierras. He venido en busca de conocimiento, pero parece que he encontrado algo mucho más valioso”, respondió él, sin poder apartar la vista de ella.\r\n" + //
                                "\r\n" + //
                                "Lyria sonrió y, con un gesto de su mano, invitó a Alaric a unirse a su danza. Juntos, recorrieron el bosque, descubriendo secretos ocultos y compartiendo historias de sus mundos. Alaric le mostró a Lyria la magia de los elementos, mientras ella le enseñaba los misterios de la naturaleza y la vida.\r\n" + //
                                "\r\n" + //
                                "Con el tiempo, su amistad se transformó en algo más profundo.Pero un dia invadieron el bosque y quemaron  todo, incluyendo a Lyria, el mago destrosado nunca ha vuelto a amar.");
        }
        else{System.out.println("ok, esta bien, entonces cuentame algo tu.");
        System.out.println("");
        Scanner cuento2= new Scanner(System .in);
        String note;
        note= cuento2.nextLine();
        System.out.println("");
        System.out.println("muy bien ");
    }
        System.out.println("");

        System.out.println("y bien "+ nombre+" cuentame algo de ti");
        System.out.println("responde true o false");
        System.out.println("");

        Scanner qu= new Scanner(System .in);
        System.out.println("");       
        boolean uq;
        uq= qu.nextBoolean();
        System.out.println("");
        if (uq) {
            Scanner sms= new Scanner(System .in);
            String sm;
            sm= sms.nextLine();
            System.out.println("ummm ya, adios "+nombre+ " espero vernos pronto");
        }else{
            System.out.println("entonces, adios "+ nombre+ "espero volvernos a encontrar");
        }

            
    }
}