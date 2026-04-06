package fatec.com.product.models;

public class Client {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String cpf;
    private String city;

    // Construtor vazio (necessário para o Spring)
    public Client() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}
