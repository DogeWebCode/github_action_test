package tw.school.rental_backend.model.geo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "district", uniqueConstraints = {@UniqueConstraint(columnNames = {"district_name", "city_id"})})
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "district_name", nullable = false)
    private String districtName;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

}
