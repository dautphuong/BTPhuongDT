import java.util.Arrays;
public class Customer {
    String name;
    String phoneNumber;
    String address;
    Order[] listOrder;

    public Customer() {
    }

    public Customer(String name, String phoneNumber, String address, Order[] listOrder) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.listOrder = listOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order[] getListOrder() {
        return listOrder;
    }

    public void setListOrder(Order[] listOrder) {
        this.listOrder = listOrder;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", listOrder=" + Arrays.toString(listOrder) +
                '}';
    }


}
