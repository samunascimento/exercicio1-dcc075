// import java.util.HashMap;
// import java.util.Map;

// enum Role {
//     ADMIN,
//     MANAGER,
//     EMPLOYEE
// }

// class User {
//     private String username;
//     private Role role;

//     public User(String username, Role role) {
//         this.username = username;
//         this.role = role;
//     }

//     public String getUsername() {
//         return username;
//     }

//     public Role getRole() {
//         return role;
//     }
// }

// class AccessControl {
//     private Map<Role, String[]> permissions;

//     public AccessControl() {
//         permissions = new HashMap<>();
//         permissions.put(Role.ADMIN, new String[]{"create", "read", "update", "delete"});
//         permissions.put(Role.MANAGER, new String[]{"read", "update"});
//         permissions.put(Role.EMPLOYEE, new String[]{"read"});
//     }
//     public boolean hasPermission(User user, String operation) {
//         String[] allowedOperations = permissions.get(user.getRole());
//         if (allowedOperations != null) {
//             for (String allowedOperation : allowedOperations) {
//                 if (allowedOperation.equals(operation)) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// public class ex1 {
//     public static void main(String[] args) {
//         User admin = new User("admin", Role.ADMIN);
//         User manager = new User("manager", Role.MANAGER);
//         User employee = new User("employee", Role.EMPLOYEE);

//         AccessControl accessControl = new AccessControl();

//         testarPermission(accessControl, admin, "create");
//         testarPermission(accessControl, manager, "update");
//         testarPermission(accessControl, employee, "delete");
//     }

//     public static void testarPermission(AccessControl accessControl, User user, String operation) {
//         if (accessControl.hasPermission(user, operation)) {
//             System.out.println(user.getUsername() + " tem permissão para " + operation);
//         } else {
//             System.out.println(user.getUsername() + " não tem permissão para " + operation);
//         }
//     }
// }


