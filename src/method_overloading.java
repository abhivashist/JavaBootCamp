class Doctor {
    public void treatPatient() {
        System.out.println("Parent class method invoke");

    }
}
    class Surgeon extends Doctor{
        public void treatPatient() {

            System.out.println("Child class method invoke");
        }
            public void treatPatient(String s)
            {
                System.out.println("Do the Medications of patient having name :"+s);

            }

    }