

@Table(name = "users")
public class AppUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique=true)
    private String email;

    @Column(nullable = false, unique=true)
    private String password;

}