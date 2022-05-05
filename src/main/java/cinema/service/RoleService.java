package cinema.service;

import cinema.model.Role;
import java.util.Optional;

public interface RoleService {
    Role save(Role role);

    Optional<Role> getByName(Role.RoleName name);
}
