create schema LibManFinal;
use LibManFinal;
-- Tạo bảng ThanhVien
CREATE TABLE ThanhVien067 (
    ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    hodem VARCHAR(255),
    ten VARCHAR(255),
    username VARCHAR(255),
    password VARCHAR(255),
    soDienThoai VARCHAR(15),
    canCuocCongDan VARCHAR(12),
    email VARCHAR(255),
    diaChi VARCHAR(255),
    vaitro VARCHAR(255)
);
-- Tạo bảng NhanVien
CREATE TABLE NhanVien067 (
    ThanhVien067_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	luongCoBan FLOAT,
    heSoLuong FLOAT,
    vaiTroNhanVien VARCHAR(255)
);
-- Tạo bảng NhanVienThuVien kế thừa từ bảng NhanVien
CREATE TABLE NhanVienThuVien067 (
    ThanhVien067_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	soNamKinhNghiem INT
);
-- Tạo bảng NhanVienQuanLy kế thừa từ bảng NhanVien
CREATE TABLE NhanVienQuanLy067 (
    ThanhVien067_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	soNamKinhNghiem INT
);
CREATE TABLE BanDoc067 (
    ThanhVien067_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    chamNgon VARCHAR(255) NULL,
    ghiChu VARCHAR(255) NULL

);
-- Tạo bảng NhaCungCap
CREATE TABLE NhaCungCap067 (
    ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tenNCC VARCHAR(255),
    diaChi VARCHAR(255),
    soDienThoai VARCHAR(15),
    email VARCHAR(255)
);
CREATE TABLE TheBanDoc067 (
    ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ngayTao DATE,
    thoiHanToiDa INT,
    BanDoc067_ID INT
);
-- Tạo bảng TaiLieu
CREATE TABLE TaiLieu067 (
    ID VARCHAR(255) NOT NULL PRIMARY KEY,
    tenTaiLieu VARCHAR(255),
    tacGia VARCHAR(255),
    namXuatBan INT,
    tongSoLuong INT,
    theLoai VARCHAR(255),
    ngonNgu VARCHAR(255)
);
CREATE TABLE DauTaiLieu067 (
    TaiLieu067_ID VARCHAR(255) NOT NULL PRIMARY KEY,
    soLuongHienCo INT
);
CREATE TABLE TaiLieuDaMuon067 (
    DauTaiLieu067_ID VARCHAR(255) NOT NULL PRIMARY KEY,
    soLuongMuon INT NOT NULL
);
CREATE TABLE PhieuMuon067 (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    ngayMuon DATE,
    ngayTraDuKien DATE,
    TheBanDoc_ID INT,
    NhanVienThuVien067_ID INT NOT NULL,
    TaiLieuDaMuon067_ID VARCHAR(255) NOT NULL
);
CREATE TABLE PhieuTra067 (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NgayTraThucTe DATE,
    soTienPhat FLOAT(10),
    TheBanDoc067_ID INT NOT NULL,
    PhieuMuon067_ID INT NOT NULL,
    NhanVienThuVien067_ID INT NOT NULL
);
CREATE TABLE HoaDonNhap067 (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NhanVienThuVien067_ID INT NOT NULL,
    ngayNhap DATE,
    NhaCungCap_ID INT NOT NULL,
    TongTien FLOAT
);
CREATE TABLE TaiLieuDaNhap067 (
    HoaDonNhap067_ID INT NOT NULL,
    DauTaiLieu067_ID VARCHAR(255) NOT NULL,
    SoLuongNhap INT,
    DonGia FLOAT
);

-- Add foreign key constraints to the tables

-- NhanVien067 references ThanhVien067
ALTER TABLE NhanVien067
ADD CONSTRAINT FK_NhanVien067_ThanhVien067
FOREIGN KEY (ThanhVien067_ID) REFERENCES ThanhVien067 (ID);

-- NhanVienThuVien067 references NhanVien067
ALTER TABLE NhanVienThuVien067
ADD CONSTRAINT FK_NhanVienThuVien067_NhanVien067
FOREIGN KEY (ThanhVien067_ID) REFERENCES NhanVien067 (ThanhVien067_ID);

-- NhanVienQuanLy067 references NhanVien067
ALTER TABLE NhanVienQuanLy067
ADD CONSTRAINT FK_NhanVienQuanLy067_NhanVien067
FOREIGN KEY (ThanhVien067_ID) REFERENCES NhanVien067 (ThanhVien067_ID);

-- BanDoc067 references Thanhvien067
ALTER TABLE BanDoc067
ADD CONSTRAINT FK_BanDoc067_ThanhVien067
FOREIGN KEY (ThanhVien067_ID) REFERENCES ThanhVien067 (ID);

-- TheBanDoc067 references BanDoc067
ALTER TABLE TheBanDoc067
ADD CONSTRAINT FK_TheBanDoc067_BanDoc067
FOREIGN KEY (BanDoc067_ID) REFERENCES BanDoc067 (ThanhVien067_ID);

-- DauTaiLieu067 references TaiLieu067
ALTER TABLE DauTaiLieu067
ADD CONSTRAINT FK_DauTaiLieu067_TaiLieu067
FOREIGN KEY (TaiLieu067_ID) REFERENCES TaiLieu067 (ID);

-- TaiLieuDaMuon067 references DauTaiLieu067
ALTER TABLE TaiLieuDaMuon067
ADD CONSTRAINT FK_TaiLieuDaMuon067_DauTaiLieu067
FOREIGN KEY (DauTaiLieu067_ID) REFERENCES DauTaiLieu067 (TaiLieu067_ID);

-- PhieuMuon067 references TheBanDoc067
ALTER TABLE PhieuMuon067
ADD CONSTRAINT FK_PhieuMuon067_TheBanDoc067
FOREIGN KEY (TheBanDoc_ID) REFERENCES TheBanDoc067 (ID);

-- PhieuMuon067 references NhanVienThuVien067
ALTER TABLE PhieuMuon067
ADD CONSTRAINT FK_PhieuMuon067_NhanVienThuVien067
FOREIGN KEY (NhanVienThuVien067_ID) REFERENCES NhanVienThuVien067 (ThanhVien067_ID);

-- PhieuMuon067 references TaiLieuDaMuon067
ALTER TABLE PhieuMuon067
ADD CONSTRAINT FK_PhieuMuon067_TaiLieuDaMuon067
FOREIGN KEY (TaiLieuDaMuon067_ID) REFERENCES TaiLieuDaMuon067 (DauTaiLieu067_ID);

-- PhieuTra067 references TheBanDoc067
ALTER TABLE PhieuTra067
ADD CONSTRAINT FK_PhieuTra067_TheBanDoc067
FOREIGN KEY (TheBanDoc067_ID) REFERENCES TheBanDoc067 (ID);

-- PhieuTra067 references PhieuMuon067
ALTER TABLE PhieuTra067
ADD CONSTRAINT FK_PhieuTra067_PhieuMuon067
FOREIGN KEY (PhieuMuon067_ID) REFERENCES PhieuMuon067 (ID);

-- PhieuTra067 references NhanVienThuVien067
ALTER TABLE PhieuTra067
ADD CONSTRAINT FK_PhieuTra067_NhanVienThuVien067
FOREIGN KEY (NhanVienThuVien067_ID) REFERENCES NhanVienThuVien067 (ThanhVien067_ID);

-- TaiLieuDaNhap067 references DauTaiLieu067
ALTER TABLE TaiLieuDaNhap067
ADD CONSTRAINT FK_TaiLieuDaNhap067_DauTaiLieu067
FOREIGN KEY (DauTaiLieu067_ID) REFERENCES DauTaiLieu067 (TaiLieu067_ID);

-- TaiLieuDaNhap067 references HoaDonNhap067
ALTER TABLE TaiLieuDaNhap067
ADD CONSTRAINT FK_TaiLieuDaNhap067_HoaDonNhap067
FOREIGN KEY (HoaDonNhap067_ID) REFERENCES HoaDonNhap067 (ID);

-- HoaDonNhap067 references NhaCungCap067
ALTER TABLE HoaDonNhap067
ADD CONSTRAINT FK_HoaDonNhap067_NhaCungCap067
FOREIGN KEY (NhaCungCap_ID) REFERENCES NhaCungCap067 (ID);

-- HoaDonNhap067 references NhanVienThuVien067
ALTER TABLE HoaDonNhap067
ADD CONSTRAINT FK_HoaDonNhap067_NhanVienThuVien067
FOREIGN KEY (NhanVienThuVien067_ID) REFERENCES NhanVienThuVien067 (ThanhVien067_ID);


-- text insert sql
use libmanfinal;
insert into thanhvien067(hodem, ten, username, password, soDienThoai, canCuocCongDan, email, diaChi, vaitro) values 
('Nguyễn Việt', 'Anh', 'vanhng2010', '201002', '0352707697', '351420201218', 'AnhNV.B20CN067@stu.ptit.edu.vn', 'ngõ 1 Trung Văn, Nam Từ Liêm, Hà Nội', 'NhanVien'),
('Nguyễn Đức', 'Vinh', 'vinhcloud', '1112002', '0912525968', '123232312321', 'Vinhphieu@gmail.com', 'ngõ 1 Trung Văn, Nam Từ Liêm, Hà Nội', 'BanDoc'),
('Vũ Hoàng', 'Anh', 'anhvh', '1162002', '0352689986', '312412453445', 'hoanganhvu@gmail.com', 'ngõ 1 Trung Văn, Nam Từ Liêm, Hà Nội', 'NhanVien')
;

insert into nhanvien067 values
(1, 6000000, 3, 'NVThuVien'),
(3, 8000000, 2, 'NVQuanLy')
;

insert into bandoc067 values
(2, 'Bạn là nhất', 'con chủ tịch nước');

insert into nhanvienthuvien067 values ( 1, 3);
insert into nhanvienquanly067 values (3, 2);


INSERT INTO TaiLieu067 (ID, tenTaiLieu, tacGia, namXuatBan, tongSoLuong, theLoai, ngonNgu)
VALUES
  ('KH001', 'Bài giảng vật lý cơ bản', 'John Smith', 2020, 50, 'Khoa Học', 'Tiếng Việt'),
  ('KH002', 'Sách hóa học hữu cơ', 'Alice Johnson', 2019, 30, 'Khoa Học', 'Tiếng Anh'),
  ('VH001', 'Tiểu thuyết Mắc xích', 'Nguyễn Nhật Ánh', 2021, 40, 'Văn Học', 'Tiếng Việt'),
  ('VH002', 'Tragedy of Hamlet', 'William Shakespeare', 1603, 20, 'Văn Học', 'Tiếng Anh'),
  ('MT001', 'Introduction to Python', 'Eric Matthes', 2020, 60, 'Máy Tính', 'Tiếng Anh'),
  ('MT002', 'SQL Database Management', 'John Doe', 2019, 45, 'Máy Tính', 'Tiếng Anh'),
  ('GD001', 'Pedagogy in the 21st Century', 'Mary Johnson', 2022, 70, 'Giáo Dục', 'Tiếng Việt'),
  ('GD002', 'Educational Psychology', 'Robert Smith', 2021, 55, 'Giáo Dục', 'Tiếng Anh'),
  ('KH003', 'Khám phá vũ trụ', 'Astronomy Association', 2022, 25, 'Khoa Học', 'Tiếng Anh'),
  ('KH004', 'Sách sinh học di truyền', 'David Miller', 2021, 30, 'Khoa Học', 'Tiếng Anh');

INSERT INTO DauTaiLieu067 (TaiLieu067_ID, soLuongHienCo)
VALUES
  ('KH001', 40),
  ('KH002', 20),
  ('KH003', 20),
  ('KH004', 28);

INSERT INTO TaiLieu067 (ID, tenTaiLieu, tacGia, namXuatBan, tongSoLuong, theLoai, ngonNgu)
VALUES
  ('VH003', 'Người mẹ họ Vương', 'Nguyễn Nhật Ánh', 2020, 35, 'Văn Học', 'Tiếng Việt'),
  ('VH004', 'To Kill a Mockingbird', 'Harper Lee', 1960, 25, 'Văn Học', 'Tiếng Anh');

INSERT INTO DauTaiLieu067 (TaiLieu067_ID, soLuongHienCo)
VALUES
  ('VH001', 35),
  ('VH002', 15),
  ('VH003', 30),
  ('VH004', 20);

INSERT INTO TaiLieu067 (ID, tenTaiLieu, tacGia, namXuatBan, tongSoLuong, theLoai, ngonNgu)
VALUES
  ('MT003', 'Java Programming', 'John Smith', 2021, 40, 'Máy Tính', 'Tiếng Anh'),
  ('MT004', 'Python for Data Science', 'Alice Johnson', 2019, 35, 'Máy Tính', 'Tiếng Anh');
INSERT INTO DauTaiLieu067 (TaiLieu067_ID, soLuongHienCo)
VALUES
  ('MT001', 50),
  ('MT002', 35),
  ('MT003', 30),
  ('MT004', 25);

INSERT INTO TaiLieu067 (ID, tenTaiLieu, tacGia, namXuatBan, tongSoLuong, theLoai, ngonNgu)
VALUES
  ('GD003', 'Educational Methods', 'Mary Johnson', 2022, 50, 'Giáo Dục', 'Tiếng Việt'),
  ('GD004', 'Teaching Strategies', 'Robert Smith', 2020, 45, 'Giáo Dục', 'Tiếng Anh');

INSERT INTO DauTaiLieu067 (TaiLieu067_ID, soLuongHienCo)
VALUES
  ('GD001', 20),
  ('GD002', 20),
  ('GD003', 45),
  ('GD004', 40);
