/*
 * Isotope 1.6
 * Copyright (C) 2019 IpsoSenso
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package isotope.modules.user.model;

import isotope.commons.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Table(
    name = "is_function"
)
public class Function extends BaseEntity {
  @Column(
      name = "code",
      nullable = false,
      length = 255
  )
  private String code;

  @Column(
      name = "date_creation",
      nullable = false
  )
  private LocalDateTime dateCreation;

  @Column(
      name = "type",
      length = 20
  )
  private String type;

  public Function() {
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LocalDateTime getDateCreation() {
    return this.dateCreation;
  }

  public void setDateCreation(LocalDateTime dateCreation) {
    this.dateCreation = dateCreation;
  }

  public Optional<String> getType() {
    return Optional.ofNullable(this.type);
  }

  public void setType(String type) {
    this.type = type;
  }
}
