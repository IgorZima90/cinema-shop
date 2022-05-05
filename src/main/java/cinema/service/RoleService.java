package mate.academy.spring.service;

import java.util.Optional;
import mate.academy.spring.model.Role;

public interface RoleService {
    Role save(Role role);

    Optional<Role> getByName(Role.RoleName name);
}
