public class decrypt {
    public static void decr(String text, int step)
    {
        String abc = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        char ch;
        char []ab = abc.toCharArray();
        char []word = text.toCharArray();
        int index, i=0;
        for(; word[i]!='.' && word[i]!='!'; i++)
        {
            if(word[i]!=' ')
            {
                index = abc.indexOf(word[i]);
                index+=step;
                if(index>32)index-=33;
                else if(index<0)index+=33;
                System.out.print(ab[index]);
            }
            else System.out.print(word[i]);
        }
        System.out.println(word[i]);
    }

    public static void decr(String text, int []step) {
        String abc = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        char ch;
        char[] ab = abc.toCharArray();
        char[] word = text.toCharArray();
        int index, i = 0;
        for (int j = 0; j < step.length; j++) {
            for (; word[i] != ' '; i++) {
                    if(i>=word.length-1)break;
                    if(word[i]=='.'){System.out.print(word[i]); continue;}
                    index = abc.indexOf(word[i]);
                    index += step[j];
                    if (index > 32) index -= 33;
                    else if (index < 0) index += 33;
                    System.out.print(ab[index]);

            }
            System.out.print(word[i]);
            i++;

        }
    }
}
