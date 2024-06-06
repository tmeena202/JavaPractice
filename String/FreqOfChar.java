package String;

public class FreqOfChar {
    // Using Char Array
    public static int freqOfChar(String string, char c){
        int freq = 0;
        int n = string.length();
        char[] chars = string.toCharArray();
        for(int i=0; i<n; i++){
            if(chars[i] == c)
                freq++;
        }
        return freq;
    }

    //  Using String method charAt()
    public static int freqOfChar2(String string, char c){
        int freq = 0;
        int n = string.length();
        for(int i=0; i<n; i++){
            if(string.charAt(i) == c)
                freq++;
        }
        return freq;
    }

    // Frequency of all character in string
    public static void freqOfAllChar(String string){
        int n = string.length();
        int[] freq = new int[n];
        char[] ch = string.toCharArray();

        for(int i=0; i<n; i++){
            if(i==n-1){
                freq[i]++;
                break;
            }
            freq[i] = 1;
            for(int j=i+1; j<n; j++){
                if(ch[i] == ch[j])
                    freq[i]++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.printf("%nFrequency of %s is %d",string.charAt(i),freq[i]);

        }
    }

    public static void main(String[] args) {
        String str = "Interview";
//        System.out.println(freqOfChar(str,'e'));
//        System.out.println(freqOfChar2(str,'i'));
        freqOfAllChar(str);
    }
}
