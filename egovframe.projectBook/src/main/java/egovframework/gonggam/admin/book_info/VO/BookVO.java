package egovframework.gonggam.admin.book_info.VO;

import java.sql.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class BookVO {
	private String bookNm;
	private String BOOK_DTL_EXPLN;
	private String PUBLIS_NM;
	private Date BOOK_INFO_REG_DT;
	private int BOOK_NO;
	private String AUT_NM;
	
	
}
