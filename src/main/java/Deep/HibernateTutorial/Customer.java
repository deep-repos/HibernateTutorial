package Deep.HibernateTutorial;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity// this will tell hibernate to treat Customer class as entity/table name
@Table(name="customer_table")//This will tell hibernate to rename  table name as customer_table
public class Customer {
	@Id //This tells hibernate to treat idVar as primary key 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this tells hibernate to set idVar as autoIncrement start with 1
	@Column(name="idVar_col")//this  tells hibernate to rename column idVar  to idVar_col
	private int idVar;//This tells hibernate to make column with column name idVar int type
	
	@Transient//This tells hibernate to no consider name as column in table
	private String name;
	
	
	 
	/*@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coupon_seq")
	 @SequenceGenerator(name = "coupon_seq", sequenceName = "coupon_seq", allocationSize = 100)
	 @Column(name = "coupon_id")
	 private Long couponId;
	 */
	 
	 // @Id//This tells hibernate to treat idVar as primary key
	 // @GeneratedValue(strategy = GenerationType.AUTO)
	  /*This tells hibernate to
	   * 	1)create Table Sequence
	   * 	2) store 1 in table sequence
	   * 	3)x = get value from table sequence //x = 1
	   * 	4)use x value to store in customer table
	   * 	5) increment  x i.e x++ ie x become 2
	   * 	6)update value x in table seqeunce
	   * 
	   * 
	   * 
	   * 
	   * 1)create table hibernate_sequence(nextval bigint)
	   * 2)insert into hibernate_sequence values(1)
	   * 3)select nextval from hibernate_seqeunce
	   * 4)insert into customer_table (coupon_id_1) values 1
	   * 5)update hibernate_seqeunce set nextval =2
	   * 
	   * */
	  
	  //@Column(name = "coupon_id_1")//this  tells hibernate to rename column couponId_1  to coupon_id_1
	  //private Long couponId_1;////This tells hibernate to make column with column name couponId_1  
	
}


