package org.jetlinks.community.logging.event.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetlinks.community.elastic.search.index.ElasticIndex;

/**
 * @author bsetfeng
 * @since 1.0
 **/
@Getter
@AllArgsConstructor
public enum LoggerIndexProvider implements ElasticIndex {

    ACCESS("access_log", "_doc"),
    SYSTEM("system_log", "_doc");

    private String index;

    private String type;
}
