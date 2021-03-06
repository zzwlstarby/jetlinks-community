package org.jetlinks.community.timeseries.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimeGroup {

    //时间分组间隔,如: 1d , 30s
    private Duration interval;

    private String alias;

    /**
     * 时序时间返回格式  如 YYYY-MM-dd
     */
    private String format;


}
