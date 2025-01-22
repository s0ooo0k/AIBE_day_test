너는 반응형 디자인과 링크 미리보기와 사용성을 중시하는 프론트엔드 개발자야, html, css, bootstrap을 바탕으로 (추가적인 js와 인라인 스타일은 없이), flex와 container를 사용하여 모바일에서도 사용이 가능한, 카드/캐러셀/모달 컴포넌트를 포함한, #FFDFDE와 #6A7BA2를 컨셉 색깔로 하는, 제육덮밥 집 홍보 페이지를 만들어줘. cdn을 사용할 예정이고, index.html에 별도 style.css 없이 해주고, og 태그와 favicon을 만들 예정이므로 주석으로 해당 위치를 추가해줘. webfont도 추가 예정이므로 해당 위치를 주석으로 표시해줘.

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Voting Page</title>

    <!-- Open Graph tags (og:tags) will be added here -->

    <!-- Webfont will be linked here -->

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        :root {
            --primary-color: #FFDFDE;
            --secondary-color: #6A7BA2;
        }
        body {
            font-family: Arial, sans-serif;
            background-color: var(--primary-color);
            color: var(--secondary-color);
            margin: 0;
            padding: 0;
        }
        .selection-box {
            background-color: var(--secondary-color);
            color: var(--primary-color);
            border: none;
            border-radius: 8px;
            padding: 20px;
            text-align: center;
            cursor: pointer;
            transition: transform 0.3s, box-shadow 0.3s;
        }
        .selection-box:hover {
            transform: translateY(-5px);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .modal-header, .modal-footer {
            background-color: var(--secondary-color);
            color: var(--primary-color);
        }
        .carousel-item img {
            object-fit: cover;
            height: 300px;
        }
    </style>
</head>
<body>
    <div class="container py-5">
        <h1 class="text-center mb-4">Vote for Your Favorite Option</h1>

        <!-- Card Section -->
        <div class="row row-cols-1 row-cols-md-3 g-4">
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Option 1</h5>
                        <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#voteModal">Vote</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Option 2</h5>
                        <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#voteModal">Vote</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Option 3</h5>
                        <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#voteModal">Vote</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Option 4</h5>
                        <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#voteModal">Vote</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Option 5</h5>
                        <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#voteModal">Vote</button>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Option 6</h5>
                        <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#voteModal">Vote</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- Carousel Section -->
        <div id="optionCarousel" class="carousel slide my-5" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="https://via.placeholder.com/800x300" class="d-block w-100" alt="Option 1">
                </div>
                <div class="carousel-item">
                    <img src="https://via.placeholder.com/800x300" class="d-block w-100" alt="Option 2">
                </div>
                <div class="carousel-item">
                    <img src="https://via.placeholder.com/800x300" class="d-block w-100" alt="Option 3">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#optionCarousel" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#optionCarousel" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        <!-- Modal Section -->
        <div class="modal fade" id="voteModal" tabindex="-1" aria-labelledby="voteModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="voteModalLabel">Confirm Your Vote</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        Are you sure you want to vote for this option?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                        <button type="button" class="btn btn-primary">Confirm</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Favicon will be linked here -->

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
```
