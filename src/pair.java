public class pair<T,U> {
    private T first;
    private U second;
    public pair(T first,U second){
        this.first = first;
        this. second =second;

    }
    public  T getFirst(){
        return  first;
    }
    public  U getSecond(){
        return  second;
    }
@Override
    public  String toString(){
        return  "pair{" +
                "first="+first+"," +
                " second="+second+"}";
}

    public static void main(String[] args) {
        pair<Integer,String> mypair = new pair<Integer,String>(1,"bushra");
        System.out.println(mypair.getFirst());
    }
}


