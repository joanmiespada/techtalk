

class Student
{

    private String name;
    private String IdCard;
    private Integer[] notes; 
    private String classroom; 


    Student(name, idcard)
    {
        this.name=name;
        this.idcard=idcard;
        this.notes = new Integer[10];
        this.classroom= "blues";
    }

    public boolean checkNumbers()
    {
        if(notes.lenght() > 10  )
        {
            switch (this.classroom) {
                case "blues":
                    for(int i=0; i< notes.lenght(); i++)
                    {
                        if(i%2==0)
                            notes[i] += notes[i+1];
                        else
                            notes[i] -= notes[i-1];
                    }    
                    break;
                case "oranges":
                    int j= notes.lenght()-1;
                    for(int =0; i< notes.lenght(); i+=2)
                    {
                        notes[i] = notes[i] + notes[j--] / 2; 
                    }
            
                default:
                    return false;
                    break;
            }
            return true;
        }else
        {
            return false;
        }
    }

}