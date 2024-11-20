package kr.hs.sdh.toast.entity;

import java.util.UUID;

/**
 * 'PEOPLE' 테이블의 데이터를 담는 클래스
 *
 * @since 2023-11-18
 * @version 0.0.1
 */
public final class People {

    /**
     * 국민 구분 고유값 (Mapped to 'PEOPLE.p_uuid')
     */
    private final UUID uuid;

    /**
     * 국민 이름 (Mapped to 'PEOPLE.p_name')
     */
    private final String name;

    /**
     * 국민 영문 이름 (Mapped to 'PEOPLE.p_english_name')
     */
    private final String englishName;

    /**
     * 국민 주민등록번호 (Mapped to 'PEOPLE.p_identity')
     */
    private final String identity;

    /**
     * 국민 대표 이메일 (Mapped to 'PEOPLE.p_email')
     */
    private final String email;

    /**
     * 국민 연락처 (Mapped to 'PEOPLE.p_contact')
     */
    private final String contact;

    /**
     * 국민 거주지 주소 (Mapped to 'PEOPLE.p_address')
     */
    private final String address;

    /**
     * {@link People} 클래스의 생성자
     *
     * @param uuid 국민 구분 고유값
     * @param name 국민 이름
     * @param englishName 국민 영문 이름
     * @param identity 국민 주민등록번호
     * @param email 국민 대표 이메일
     * @param contact 국민 연락처
     * @param address 국민 거주지 주소
     */
    public People(
        final UUID uuid,
        final String name,
        final String englishName,
        final String identity,
        final String email,
        final String contact,
        final String address
    ) {
        this.uuid = uuid;
        this.name = name;
        this.englishName = englishName;
        this.identity = identity;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public String getIdentity() {
        return this.identity;
    }

    public String getEmail() {
        return this.email;
    }

    public String getContact() {
        return this.contact;
    }

    public String getAddress() {
        return this.address;
    }



    @Override
    public boolean equals(final Object object) {
        if (object != null) {
            if (this == object) {
                return true;
            }

            if (object instanceof final People people) {
                return this.identity.contentEquals(people.identity) || this.uuid.equals(people.uuid);
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.identity.hashCode();
    }

}