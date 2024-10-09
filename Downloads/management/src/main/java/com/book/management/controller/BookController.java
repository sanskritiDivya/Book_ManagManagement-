@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;
    
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
    
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
