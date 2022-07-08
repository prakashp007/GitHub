class Book{
    int bid;
    String bnm,author;
    float price;
        public void getData(int bid,String bnm,String author,float price){
            this.bid=bid;
            this.bnm=bnm;
            this.author=author;
            this.price=price;
        }
        public void printData(){
            System.out.println("Book ID : "+bid+"\n BooK Name " + bnm + "\n Book Author Name : "+ author + "\n Book price : "+price);
        }
        public static void main(String[] args){
            Book b1=new Book();
            b1.getData(1,"python-meterial","hitesh",101);
            b1.printData();
            
        }
}