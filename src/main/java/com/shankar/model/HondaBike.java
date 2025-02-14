package com.shankar.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="Honda_Bike")
public class HondaBike {
  @Id
  @SequenceGenerator(name="gen1",sequenceName = "bike_no_seq",initialValue = 1,allocationSize = 100)
  @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
    public Integer bikeid;
  @Column
  @NonNull
    public String bikename;
  @Column
  @NonNull
    public String enginecc;
  @Column
  @NonNull
    public String address;

/*public HondaBike(String bikename,String enginecc,String address){
  this.bikename=bikename;
  this.enginecc=enginecc;
  this.address=address;
}*/

  public Integer getBikeid(){
    return bikeid;
  }
}
