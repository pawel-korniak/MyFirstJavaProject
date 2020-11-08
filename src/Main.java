public class Main {
    public static void main(String [] args){
        ContactManager myContactManager = new ContactManager();
        Contact tab[] = new Contact[10];
        tab[0] = new Contact("pawel","111111111111");
        tab[1] = new Contact("tomek","222222222222");
        tab[2] = new Contact("maciek","333333333333");
        tab[3] = new Contact("ola","4444444444444");

        for(int i=0;i<4;i++){
            myContactManager.addContact(tab[i]);
        }
        String searchName ="tomek";
        System.out.println(searchName+" "+myContactManager.searchContact(searchName).phoneNumber);


    }
}
