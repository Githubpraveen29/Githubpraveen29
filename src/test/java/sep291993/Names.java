package sep291993;



 class Names {
    public String firstName;

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     public String lastName;
     public String middleName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
     public void displayName() {
         System.out.println("The: " + firstName + " " + middleName + " " + lastName);

    }

 }
