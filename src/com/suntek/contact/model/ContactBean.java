package com.suntek.contact.model;

public class ContactBean
{

	private int contactId; // id
	private String contactName;// ÐÕÃû
	private String phoneNum; // µç»°ºÅÂë
	private String sortKey; // ÅÅÐò¹Ø¼ü×Ö
	private Long photoId; // Í¼Æ¬id
	private String lookUpKey;
	private int selected = 0;
	private String formattedNumber;
	private String pinyin; // ÐÕÃûÆ´Òô

	public int getContactId()
	{
		return contactId;
	}

	public void setContactId(int contactId )
	{
		this.contactId = contactId;
	}

	public String getDesplayName()
	{
		return contactName;
	}

	public void setDesplayName(String desplayName )
	{
		this.contactName = desplayName;
	}

	public String getPhoneNum()
	{
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum )
	{
		this.phoneNum = phoneNum;
	}

	public String getSortKey()
	{
		return sortKey;
	}

	public void setSortKey(String sortKey )
	{
		this.sortKey = sortKey;
	}

	public Long getPhotoId()
	{
		return photoId;
	}

	public void setPhotoId(Long photoId )
	{
		this.photoId = photoId;
	}

	public String getLookUpKey()
	{
		return lookUpKey;
	}

	public void setLookUpKey(String lookUpKey )
	{
		this.lookUpKey = lookUpKey;
	}

	public int getSelected()
	{
		return selected;
	}

	public void setSelected(int selected )
	{
		this.selected = selected;
	}

	public String getFormattedNumber()
	{
		return formattedNumber;
	}

	public void setFormattedNumber(String formattedNumber )
	{
		this.formattedNumber = formattedNumber;
	}

	public String getPinyin()
	{
		return pinyin;
	}

	public void setPinyin(String pinyin )
	{
		this.pinyin = pinyin;
	}
}
