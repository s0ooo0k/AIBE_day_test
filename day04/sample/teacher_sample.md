<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta
      name="description"
      content="맛있는 제육덮밥을 즐길 수 있는 제육덮밥 전문점"
    />
    <meta property="og:title" content="제육덮밥 집" />
    <meta
      property="og:description"
      content="맛있는 제육덮밥을 즐길 수 있는 제육덮밥 전문점입니다. 다양한 메뉴와 함께합니다!"
    />
    <meta property="og:image" content="path/to/og-image.jpg" />
    <meta property="og:url" content="http://www.jeyukbap.com" />
    <meta name="twitter:card" content="summary_large_image" />

    <!-- Favicon 위치 -->
    <link rel="icon" href="path/to/favicon.ico" type="image/x-icon" />

    <title>제육덮밥 집</title>

    <!-- Webfont 추가 위치 -->
    <link
      href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;700&display=swap"
      rel="stylesheet"
    />

    <!-- Bootstrap CDN -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />

    <style>
      /* 색상 설정 */
      body {
        font-family: "Noto Sans KR", sans-serif;
        background-color: #ffdfde;
      }

      .navbar {
        background-color: #6a7ba2;
      }

      .navbar-brand,
      .navbar-nav .nav-link {
        color: #fff;
      }

      .card {
        background-color: #fff;
        border: none;
        border-radius: 15px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      }

      .card-title {
        color: #6a7ba2;
      }

      .btn-custom {
        background-color: #6a7ba2;
        color: #fff;
      }

      .btn-custom:hover {
        background-color: #ffdfde;
        color: #6a7ba2;
      }

      .carousel-item img {
        width: 100%;
        height: 100%;
        object-fit: cover;
      }

      .modal-content {
        border-radius: 15px;
      }
    </style>

  </head>

  <body>
    <!-- 네비게이션 바 -->
    <nav class="navbar navbar-expand-lg">
      <div class="container">
        <a class="navbar-brand" href="#">제육덮밥 집</a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item">
              <a class="nav-link" href="#">메뉴</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">소개</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">연락처</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- 캐러셀 -->
    <div
      id="carouselExampleAutoplaying"
      class="carousel slide carousel-fade"
      data-bs-ride="carousel"
    >
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img
            src="path/to/your-image1.jpg"
            class="d-block w-100"
            alt="제육덮밥 이미지 1"
          />
        </div>
        <div class="carousel-item">
          <img
            src="path/to/your-image2.jpg"
            class="d-block w-100"
            alt="제육덮밥 이미지 2"
          />
        </div>
        <div class="carousel-item">
          <img
            src="path/to/your-image3.jpg"
            class="d-block w-100"
            alt="제육덮밥 이미지 3"
          />
        </div>
      </div>
    </div>

    <!-- 카드 컴포넌트 -->
    <div class="container my-5">
      <div class="row row-cols-1 row-cols-md-3 g-4">
        <div class="col">
          <div class="card">
            <img
              src="path/to/card-image1.jpg"
              class="card-img-top"
              alt="카드 이미지 1"
            />
            <div class="card-body">
              <h5 class="card-title">제육덮밥 A</h5>
              <p class="card-text">매콤한 제육덮밥 A, 풍미 가득한 맛!</p>
              <a
                href="#"
                class="btn btn-custom"
                data-bs-toggle="modal"
                data-bs-target="#modalDetail"
                >자세히 보기</a
              >
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img
              src="path/to/card-image2.jpg"
              class="card-img-top"
              alt="카드 이미지 2"
            />
            <div class="card-body">
              <h5 class="card-title">제육덮밥 B</h5>
              <p class="card-text">
                매콤하고 부드러운 제육덮밥 B, 최고의 조합!
              </p>
              <a
                href="#"
                class="btn btn-custom"
                data-bs-toggle="modal"
                data-bs-target="#modalDetail"
                >자세히 보기</a
              >
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card">
            <img
              src="path/to/card-image3.jpg"
              class="card-img-top"
              alt="카드 이미지 3"
            />
            <div class="card-body">
              <h5 class="card-title">제육덮밥 C</h5>
              <p class="card-text">진한 맛을 자랑하는 제육덮밥 C!</p>
              <a
                href="#"
                class="btn btn-custom"
                data-bs-toggle="modal"
                data-bs-target="#modalDetail"
                >자세히 보기</a
              >
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- 모달 컴포넌트 -->
    <div
      class="modal fade"
      id="modalDetail"
      tabindex="-1"
      aria-labelledby="modalDetailLabel"
      aria-hidden="true"
    >
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="modalDetailLabel">제육덮밥 A</h5>
            <button
              type="button"
              class="btn-close"
              data-bs-dismiss="modal"
              aria-label="Close"
            ></button>
          </div>
          <div class="modal-body">
            제육덮밥 A의 자세한 설명을 여기에 추가합니다. 더 맛있게 만드는
            비법도 확인하세요!
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn btn-secondary"
              data-bs-dismiss="modal"
            >
              닫기
            </button>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap JS, Popper.js -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>

  </body>
</html>
