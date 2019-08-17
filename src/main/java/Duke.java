public class Duke {
    public static void main(String[] args) {
<<<<<<< HEAD
        greet();
        String[] inputArr = new String[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if(input.equals("list")) {
                listTasks(inputArr);
            } else if (!input.equals("bye")) {
                echo(input);
                inputArr[i] = input;
                i++;
            } else {
                exit();
                break;
            }
        }
    }

    public static void greet() {
        String message = "Hello! I'm Duke\n" +
                "What can I do for you?";
        System.out.println(message);
    }

    public static void echo(String s) {
        System.out.println("added: " + s);
    }

    public static void exit() {
        String byeMessage = "Bye. Hope to see you again soon!";
        System.out.println(byeMessage);
    }

    public static void listTasks(String[] arr) {
        for (int j = 0; (j < arr.length) && arr[j] != null; j++) {
            System.out.println(j + 1 + " " + arr[j]);
        }
    }
=======
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
    }
>>>>>>> parent of 8cc22b2... Added greet, echo, exit functions for level 1
}
