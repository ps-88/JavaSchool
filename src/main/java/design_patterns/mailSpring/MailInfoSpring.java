package design_patterns.mailSpring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MailInfoSpring {

    private String text;
    private int mailType;
    private String email;
}
