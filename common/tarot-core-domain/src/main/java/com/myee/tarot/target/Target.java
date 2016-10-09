package com.myee.tarot.target;

import com.myee.tarot.core.GenericEntity;
import com.myee.tarot.merchant.domain.Merchant;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Entity
@Table(name = "T_TARGET")
@Cacheable
@DynamicUpdate
public class Target extends GenericEntity<Long, Target> {

    @Id
    @Column(name = "TARGET_ID", unique = true, nullable = false)
    @TableGenerator(name = "TABLE_GEN", table = "C_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "TARGET_SEQ_NEXT_VAL",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
    protected Long id;

    @Column(name = "CONTENT", nullable = false)
    protected String content;

    @Column(name = "SIGN_ID", nullable = false)
    protected Long signId;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getSignId() {
        return signId;
    }

    public void setSignId(Long signId) {
        this.signId = signId;
    }
}
