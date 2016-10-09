package com.myee.tarot.target;

import com.myee.tarot.core.GenericEntity;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Entity
@Table(name = "T_SIGNATURE")
@Cacheable
@DynamicUpdate
public class Signature extends GenericEntity<Long, Signature> {
    @Id
    @Column(name = "SIGNATURE_ID", unique = true, nullable = false)
    @TableGenerator(name = "TABLE_GEN", table = "C_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "SIGNATURE_SEQ_NEXT_VAL",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
    protected Long id;

    @Column(name = "SIGN_TIME")
    protected Date signTime;

    @Column(name = "SIGNED_STATUS")
    protected Integer signedStatus; //1-> 已签到 0-> 未签到

    @ManyToOne(targetEntity = Target.class, optional = false, cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "SIGN_ID",referencedColumnName = "SIGN_ID")
    protected Target target;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public Integer getSignedStatus() {
        return signedStatus;
    }

    public void setSignedStatus(Integer signedStatus) {
        this.signedStatus = signedStatus;
    }
}
