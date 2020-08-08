// This program is to check if the character is a vowel or consonant or a special character
class alphabet
{
    char a;
    alphabet(char alpha)
    {
        a=alpha;
    }
    void calc_Print()
    {
        switch (a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("The letter is a vowel");
            break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            System.out.println("The letter is a consonant");
            break;
            default:
            System.out.println("Special character");
            break;
        }
    }
    public static void main()
    {
        alphabet a1=new alphabet('e');
        a1.calc_Print();
    }
}