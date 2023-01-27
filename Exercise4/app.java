import java.security.acl.Owner;

public class App {
   
        public static void main(String[] args) throws Exception {
    
    
            Person Friend = new Person("Anna", 19);
    
            Myself Me= new Myself("CJ", 19); 
    
            Me.Addfriend(Friend);
            
            Pet Dog= new Pet("Skye", Friend);
            Dog.showOwnerName();

            Car Cars = new Car("Lambo", Me);
            Cars.ownerCar();

           

            
            
        }
    
    }
