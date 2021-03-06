package cn.easy.xinjing.bean.api;

import cn.easy.base.domain.core.AtEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

public class ContentHospitalBean extends AtEntity {
	/**场景分配id*/
	private String contentDpId;
	/**内容Id*/
	private String contentId;
	/**内容Id*/
	private String contentName;
	/**状态*/
	private Integer status;

	public String getContentName() {
		return contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public String getContentDpId() { return contentDpId; }
	public void setContentDpId(String contentDpId) { this.contentDpId = contentDpId; }
	public String getContentId() { return contentId; }
	public void setContentId(String contentId) { this.contentId = contentId; }
	public Integer getStatus() { return status; }
	public void setStatus(Integer status) { this.status = status; }

}
